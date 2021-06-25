import React from "react";
import {NavLink} from "react-router-dom";
import style from './Navbar.module.css'

const Navbar = () => {
    return <div className={style.nav}>
        <div className={style.linkWrapper}>
            <NavLink to='/themes'>Themes</NavLink>
        </div>
        <div className={style.linkWrapper}>
            <NavLink to='/users'>Users</NavLink>
        </div>
    </div>
}

export default Navbar;
