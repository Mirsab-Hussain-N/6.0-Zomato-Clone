import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import RestaurantList from "./components/RestaurantList";
import HomePage from './pages/HomePage';
import SignupPage from './pages/SignupPage';
import LoginPage from './pages/LoginPage';
import ForgotPasswordPage from './pages/ForgotPasswordPage';

  //TESTING to check if we can retrive all restaurants or not: 
    // <div className="App">
    //   <h1>Food Delivery App</h1>
    //   <RestaurantList/> 
    //   {/* yes */}
    // </div>

function App() {
  return (
    <Router>
      <Routes>
        <Route path = "/" element = {<HomePage/>}/>
        <Route path = "signup" element = {<SignupPage/>}/>
        <Route path = "login" element = {<LoginPage/>}/>
        <Route path="/forgotpassword" element={<ForgotPasswordPage />} />
      </Routes>
    </Router>
    
    

  );
}

export default App;
