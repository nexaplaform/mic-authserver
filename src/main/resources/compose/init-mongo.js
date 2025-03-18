db = db.getSiblingDB('authserver');

// Crear un usuario con permisos de lectura y escritura en la base de datos 'apigateway'
db.createUser({
  user: "authserver",
  pwd: "pauthserver",
  roles: [
    {
      role: "readWrite",
      db: "apigateway" // Asegúrate de que el rol se asocia con la base de datos correcta
    }
  ]
});