// Sending a GET request using fetch API
fetch('http://localhost:9009/a/products', {
    method: 'GET', // GET request
    headers: {
        'Accept': 'application/json' // The content type of the response
    }
})
.then(response => {
    if (!response.ok) {
        throw new Error('Network response was not ok ' + response.statusText);
    }
    return response.json(); // Parse the response as JSON
})
.then(data => {
    console.log('Success:', data); // Handle the response data
})
.catch((error) => {
    console.error('Error:', error); // Handle any errors
});