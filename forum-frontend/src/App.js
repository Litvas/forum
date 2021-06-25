import './App.css';
import {BrowserRouter} from "react-router-dom";
import Navbar from './components/Navbar/Navbar'

const App = () => {
    return (
        <BrowserRouter>
            <div className="App">
                <Navbar/>
            </div>
        </BrowserRouter>
    );
}

export default App;
