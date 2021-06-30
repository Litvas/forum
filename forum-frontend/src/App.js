import {BrowserRouter, Route} from "react-router-dom";
import Navbar from './components/Navbar/Navbar'
import ThemeContainer from "./components/Theme/ThemeContainer";
import Header from "./components/Header/Header";
import style from './App.css'
import React, {useState} from "react";
import ThemeContent from "./components/Theme/ThemeContent";

const App = () => {
    return (
        <BrowserRouter>
            <div className={style.appWrapper}>
                <Header/>
                <Navbar/>
                <div>
                    <Route path='/themes' render={() => <ThemeContainer/>}></Route>
                    {/*<Route path='/themes/:themeId?' render={() => <ThemeContainer/>}></Route>*/}</div>
                <Route path="/themes/:id" children={<ThemeContent/>}/>
            </div>
        </BrowserRouter>
    );
}

export default App;
