import React, { use } from "react";
import {Link} from "react-router-dom";
import { useCart } from "../contexts/CartContent";
// import "./Header.css";

const Header = () => {
  const {cartItems} = useCart();


  return (
    <header>
      <div className="header-content">    
        <div className="logo">
          <h3><Link to="/" style={{ textDecoration: "none", color: "white" }}>Food Express</Link></h3>
        </div>

        <div className="search-bar">
          <input type="text" placeholder="Search for Restaurant" />
          <span className="search-icon">🔍</span>
        </div>

        <div className="user-actions">
          <Link to="/login" ><p className="p-size">Log in </p></Link>
          <Link to="/signup"><p className="p-size">Sign in </p></Link>
          <Link to="/cart" className="cart-link">
            <p className="p-size">
            🛒 Cart
            {cartItems.length > 0 && (
              <span className="cart-badge">{cartItems.length}</span>
            )}
            </p>
          </Link>
        </div>
      </div>
    </header>
  );
};

export default Header;
