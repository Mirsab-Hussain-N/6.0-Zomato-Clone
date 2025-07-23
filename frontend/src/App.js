import logo from './logo.svg';
import './App.css';
import RestaurantList from "./components/RestaurantList";
import HomePage from './pages/HomePage';

  //TESTING to check if we can retrive all restaurants or not: 
    // <div className="App">
    //   <h1>Food Delivery App</h1>
    //   <RestaurantList/> 
    //   {/* yes */}
    // </div>

function App() {
  return (
    <div>
        <HomePage/>
        {/* <RestaurantList/> */}
    </div>
    
    

  );
}

export default App;
