import React from "react";
import {Link} from "react-router-dom";

const Header = () => {
  return (
    <header>
      <div className="header-content">    
        <div className="logo">
          Food Express
        </div>
        <div className="search-bar">
          <input type="text" placeholder="Search for Restaurant" />
          <span className="search-icon">🔍</span>
        </div>
        <div className="user-actions">
          <Link to="/login">Log in</Link>
          <Link to="/signup">Sign in</Link>
        </div>
      </div>
    </header>
  );
};

export default Header;
