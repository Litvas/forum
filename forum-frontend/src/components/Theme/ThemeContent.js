import React, {useEffect, useState} from "react";
import {NavLink, useParams} from "react-router-dom";
import axios from "axios";

const ThemeContent = () => {

    let {id} = useParams();
    const [themeContent, setThemeContent] = useState([]);

    useEffect(() => {
        const fetchPost = async () => {
            // hardcode
            const res = await axios.get('http://localhost:8484/api/posts/themes/' + id);
            setThemeContent(res.data);
        };

        fetchPost();
    }, []);

    return <div>
        <div>{themeContent.map(post => (
            <div key={post.id}>
                <label>Author:</label>
                <NavLink to={'/themes/' + post.author.name}>
                    {post.author.name}
                </NavLink>
                <div>{post.content}</div>
            </div>
        ))} </div>
    </div>
}

export default ThemeContent;
