import Header from './components/Header' 
import Footer from './components/Footer'
import './App.css'
import { Route, Routes } from 'react-router-dom'

function App() {


  return (
    <>
      <Header />
      <main>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/sobre-nos" element={<SobreNos />} />
          <Route path="/produtos" element={<Produtos />} />
          <Route path="/servicos" element={<Servicos />} />
        </Routes>

      </main>
      <Footer />
    </>
  )
}

export default App
