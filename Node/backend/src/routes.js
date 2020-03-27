const express = require('express');
const OngController = require('./controllers/OngController');
const incidentsController = require('./controllers/incidentsController');
const profileController = require('./controllers/profileController');
const sessionController = require('./controllers/sessionController');
const routes = express.Router();

routes.post('/session',sessionController.create);

routes.get('/ongs', OngController.index);
routes.post('/ongs',OngController.create);

routes.get('/profile', profileController.index);

routes.get('/incidents', incidentsController.index);
routes.post('/incidents', incidentsController.create);
routes.delete('/incidents/:id', incidentsController.delete);
    module.exports = routes;