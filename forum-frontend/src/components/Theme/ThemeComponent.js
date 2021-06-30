import React from "react";
import {NavLink} from "react-router-dom";

const ThemeComponent = ({themesArray}) => {

    return <div>{themesArray.map(theme => (
        <NavLink to={'/themes/' + theme.title}>
            <div key={theme.id}>{theme.title}</div>
        </NavLink>
    ))}</div>
}

export default ThemeComponent;
