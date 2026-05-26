import { useState } from 'react'
import './style.css'

export default function InfoCurso(params) {
    
    const [nome, setNome] = useState('Lógica de programação')
    const [cargaHoraria, setCargaHoraria] = useState(162)
    const [dataInicio, setDataInicio] = useState('03/02/2025')
    const [dataTermino, setDataTermino] = useState('18/12/2026')
    const [linguagemAprendida, setLinguagem] = useState('Pynton, Java, React')
    const [temaTcc, setTematcc] = useState('Dende Tech')



    return(

        <div className='info-curso'>
            <h2>Dados do curso: </h2>
            <p>Nome: { nome }</p>
            <p>Carga horária: { cargaHoraria }</p>
            <p>Data de Início: { dataInicio }</p>
            <p>Data de término: { dataTermino }</p>
            <p>Linguagem aprendida: { linguagemAprendida }</p>
            <p>Tema do TCC: { temaTcc }</p>
        </div>

    )
    
}