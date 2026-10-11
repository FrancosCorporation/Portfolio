import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import App from './App';
import './styles/global.css';
import 'leaflet/dist/leaflet.css';

const root = document.getElementById('root');

if (!root) {
  throw new Error('O elemento raiz do aplicativo não foi encontrado.');
}

createRoot(root).render(
  <StrictMode>
    <App />
  </StrictMode>,
);
