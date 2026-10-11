import { FiArrowLeft, FiMapPin } from 'react-icons/fi';
import { Link } from 'react-router-dom';
import { MapContainer, TileLayer } from 'react-leaflet';
import { MAP_TILE_URL } from '../config';
import MarkerImg from '../images/marker.svg';
import '../styles/pages/orphanages-maps.css';

export default function OrphanagesMaps() {
  return (
    <main id="page-map">
      <aside className="map-sidebar">
        <header>
          <Link to="/" className="map-brand" aria-label="Voltar ao início">
            <img src={MarkerImg} alt="" />
            <span>Happy</span>
          </Link>
          <p className="eyebrow">Inhumas · Goiás</p>
          <h1>Encontre um lugar para visitar.</h1>
          <p className="map-intro">Explore o mapa e conheça as instituições disponíveis na região.</p>
        </header>

        <section className="empty-state" aria-labelledby="empty-title">
          <FiMapPin aria-hidden="true" />
          <div>
            <h2 id="empty-title">Nenhum local cadastrado ainda</h2>
            <p>Quando houver instituições disponíveis, elas aparecerão aqui e no mapa.</p>
          </div>
        </section>

        <footer className="map-footer">
          <span>
            <strong>Inhumas</strong><br />Goiás, Brasil
            <a className="map-issue-link" href="https://www.openstreetmap.org/fixthemap" target="_blank" rel="noopener noreferrer">
              Encontrou um erro no mapa? Avise a comunidade.
            </a>
          </span>
          <Link to="/" aria-label="Voltar para a página inicial"><FiArrowLeft aria-hidden="true" /></Link>
        </footer>
      </aside>

      <section className="map-stage" aria-label="Mapa de Inhumas, Goiás">
        <MapContainer
          center={[-16.3565191, -49.4974716]}
          zoom={14}
          scrollWheelZoom={false}
          aria-label="Mapa interativo de Inhumas"
        >
          <TileLayer
            url={MAP_TILE_URL}
            attribution='&copy; <a href="https://www.openstreetmap.org/copyright" target="_blank" rel="noreferrer">OpenStreetMap</a> contributors'
          />
        </MapContainer>
      </section>
    </main>
  );
}
