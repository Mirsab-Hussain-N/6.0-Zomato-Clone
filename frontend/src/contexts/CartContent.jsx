import React, {useState, useEffect, createContext, useContext} from "react";
import axios from "axios";

const CartContext = createContext();

export const useCart = () => useContext(CartContext);

export const CartProvider = ({children}) =>{
    const [cartItems, setCartItems] = useState([]);

    const addToCart = (item) => {
    setCartItems((prev) => {
      const existing = prev.find((i) => i.id === item.id);
      if (existing) {
        return prev.map((i) =>
          i.id === item.id ? { ...i, quantity: i.quantity + 1 } : i
        );
      } else {
        return [...prev, { ...item, quantity: 1 }];
      }
    });
  };

    const removeFromCart = (itemId) => {
        setCartItems( (prev) => prev.filter((item) => item.id !== itemId));
    };

    const clearCart = () => setCartItems([]);

    return(
        <CartContext.Provider value= { {cartItems, addToCart, removeFromCart, clearCart}}>
            {children}
        </CartContext.Provider>
    );
};