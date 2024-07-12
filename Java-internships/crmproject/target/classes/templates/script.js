// script.js
document.addEventListener('DOMContentLoaded', () => {
    const contactForm = document.getElementById('contactForm');
    const contactTableBody = document.getElementById('contactTable').getElementsByTagName('tbody')[0];

    // Fetch and display contacts on page load
    fetchContacts();

    // Handle form submission
    contactForm.addEventListener('submit', (e) => {
        e.preventDefault();
        
        const formData = new FormData(contactForm);
        const contact = {
            name: formData.get('name'),
            address: formData.get('address'),
            phone: formData.get('phone'),
            email: formData.get('email'),
            socialMedia: formData.get('socialMedia')
        };

        // Send POST request to add contact
        fetch('/api/contacts', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(contact)
        })
        .then(response => response.json())
        .then(data => {
            // Add new contact to the table
            addContactToTable(data);
            // Clear the form
            contactForm.reset();
        })
        .catch(error => console.error('Error:', error));
    });

    // Function to fetch contacts and display them
    function fetchContacts() {
        fetch('/api/contacts')
            .then(response => response.json())
            .then(data => {
                data.forEach(contact => addContactToTable(contact));
            })
            .catch(error => console.error('Error:', error));
    }

    // Function to add a contact to the table
    function addContactToTable(contact) {
        const row = contactTableBody.insertRow();

        row.insertCell(0).textContent = contact.name;
        row.insertCell(1).textContent = contact.address;
        row.insertCell(2).textContent = contact.phone;
        row.insertCell(3).textContent = contact.email;
        row.insertCell(4).textContent = contact.socialMedia;

        const actionsCell = row.insertCell(5);
        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.classList.add('delete-button');
        deleteButton.onclick = () => deleteContact(contact.id, row);
        actionsCell.appendChild(deleteButton);
    }

    // Function to delete a contact
    function deleteContact(contactId, row) {
        fetch(`/api/contacts/${contactId}`, {
            method: 'DELETE'
        })
        .then(() => {
            row.remove();
        })
        .catch(error => console.error('Error:', error));
    }
});

