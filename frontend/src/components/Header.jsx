import React from "react";

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
          <a href="#">Log in</a>
          <a href="#">Sign in</a>
        </div>
      </div>
    </header>
  );
};

export default Header;
