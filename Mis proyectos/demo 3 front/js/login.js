const $formulario = document.getElementById('user-form');

$formulario.addEventListener('submit', (e) => {
  e.preventDefault();

  const nombre = document.getElementById('exampleInputName').value;
  const apellido = document.getElementById('exampleInputLastName').value;
  const fechaNac = document.getElementById('exampleInputDateOfBirth').value;
  const email = document.getElementById('exampleInputEmail1').value;
  const contracenia = document.getElementById('exampleInputPassword1').value;

  if (nombre === '' && apellido === '' && fechaNac === '') {
    return alert('Todos los espacios están vacíos');
  }

  const datos = {
    userName: nombre,
    userLastName: apellido,
    birthday: fechaNac,
    email: email,
    password: contracenia,
  };

  console.log(datos);

  $formulario.reset();

  fetch('http://localhost:8080/infoUsers/agregarUsuario', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(datos),
  })
    .then((response) => response.json())
    .then((data) => {
      console.log('Success:', data);
    })
    .catch((error) => {
      console.error('Error:', error);
    });
});

