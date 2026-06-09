import { Link } from 'react-router-dom'
import './style.css'

export default function Header() {
    return (
        <header>
            <div>
                <Link to="/" className="header-logo">
                    <h1>Empresa de contabilidade</h1>
                </Link>
                <p>Contabilidade, consultoria e serviços financeiros para o seu negócio.</p>
            </div>

            <nav>
                <NavLink>
                    <Link to="/">Home</Link>
                </NavLink>
                <NavLink>
                    <Link to="/sobre-nos">Sobre</Link>
                </NavLink>
                <NavLink>
                    <Link to="/produtos">Produtos</Link>
                </NavLink>
                <NavLink>
                    <Link to="/servicos">Serviços</Link>
                </NavLink>
            </nav>
        </header>
    )
}