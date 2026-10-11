import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Landing from './pages/landing';
import OrphanagesMaps from './pages/OrphanagesMaps';

function NotFound() {
  return (
    <main className="not-found">
      <p>Happy</p>
      <h1>Esta página não existe.</h1>
      <Link to="/">Voltar ao início</Link>
    </main>
  );
}

export default function AppRoutes() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Landing />} />
        <Route path="/app" element={<OrphanagesMaps />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}
