import React from 'react';
import MarkerImg from '../images/marker.svg';
import { Link } from 'react-router-dom';
import { FiPlus } from 'react-icons/fi';
import '../styles/pages/orphanages-maps.css'
import { Map, TileLayer } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
function OrphanagesMaps() {
    return (
        <div id="page-map">
            <aside>
                <header>
                    <img src={MarkerImg} alt="Happy" />

                    <h2>Escolha um Orfanato no Mapa</h2>
                    <p> Muitas crianças estão esperando a sua visita :) </p>
                </header>
                <footer>
                    <strong>Inhumas</strong>
                    <span>Góias</span>
                </footer>

            </aside>
            <Map 
            center={[-16.3565191,-49.4974716]}
            zoom={15}
            style={{width:'100%', height:'100%'}}
            >
                {/* <TileLayer url="https://a.tile.openstreetmap.org/{z}/{x}/{y}.png"/> */}
                <TileLayer url={`https://api.mapbox.com/styles/v1/mapbox/dark-v10/tiles/256/{z}/{x}/{y}@2x?access_token=${process.env.REACT_APP_MAPBOX_TOKEN}`}/>
            </Map>
            
            <Link to="" className='create-orphanage'>
                <FiPlus size={32} color="#FFF" />
            </Link>
        </div>
    )
}


export default OrphanagesMaps;
