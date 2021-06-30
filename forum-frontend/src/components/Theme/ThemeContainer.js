import React, {useEffect, useState} from "react";
import axios from "axios";
import ThemeComponent from "./ThemeComponent";
import style from './ThemeContainer.module.css'

const ThemeContainer = () => {
    const [themes, setTheme] = useState([]);

    useEffect(() => {
        const fetchPost = async () => {
            // hardcode
            const res = await axios.get('http://localhost:8484/api/themes');
            setTheme(res.data);
        };

        fetchPost();
    }, []);

    return <div className={style.themes}>
        <h1>Themes</h1>
        <ThemeComponent themesArray={themes}/>
    </div>
}
export default ThemeContainer;
