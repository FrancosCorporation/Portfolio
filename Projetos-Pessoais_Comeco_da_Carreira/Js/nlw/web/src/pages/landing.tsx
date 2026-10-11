import { FiArrowRight } from 'react-icons/fi';
import { Link } from 'react-router-dom';
import logoimg from '../images/logo.svg';
import '../styles/pages/landing.css';

export default function Landing() {
  return (
    <div id="page-landing">
      <div className="content-wrapper">
        <header className="landing-header">
          <img src={logoimg} alt="Happy" />
          <p className="location"><strong>Inhumas</strong><span>Goiás, Brasil</span></p>
        </header>

        <main className="landing-copy">
          <p className="eyebrow">Visitas que fazem a diferença</p>
          <h1>Leve felicidade para mais perto.</h1>
          <p className="landing-description">
            Encontre instituições cadastradas e planeje uma visita com carinho e respeito.
          </p>
          <Link to="/app" className="explore-link">
            Explorar o mapa <FiArrowRight aria-hidden="true" />
          </Link>
        </main>

        <footer className="landing-footer">
          <span>Comece por Inhumas, Goiás.</span>
          <Link to="/app" className="Enter-App" aria-label="Abrir mapa de instituições">
            <FiArrowRight aria-hidden="true" />
          </Link>
        </footer>
      </div>
    </div>
  );
}
