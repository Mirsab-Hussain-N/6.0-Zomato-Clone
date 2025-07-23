import React from 'react';

const RestaurantCard = ({ restaurant }) => (
  <a href={`/restaurant?id=${restaurant.id}`} className="restaurant-card">
    <div className="restaurant-image">
      <img src={restaurant.imageUrl} alt={restaurant.name} />
      <div className="offer-badge">50% OFF</div>
    </div>
    <div className="restaurant-info">
      <h3 className="restaurant-name">{restaurant.name}</h3>
      <p className="restaurant-cuisine">{restaurant.description}</p>
      <div className="restaurant-details">
        <span className="price">₹{restaurant.price} for one</span>
        <span className="delivery-time">{restaurant.deliveryTime} min</span>
      </div>
    </div>
  </a>
);

export default RestaurantCard;
