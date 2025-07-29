# DevEats 🍽️ – Food Delivery Web App

DevEats is a full-stack food delivery web application where users can explore restaurants, browse menus, place orders, and track past purchases — all in a clean, modern UI.

---

## 🚀 Tech Stack

- 🔹 Frontend: React.js, HTML, CSS
- 🔹 Backend: Spring Boot (Java)
- 🔹 Database: MySQL
- 🔹 Tools & Libraries: Axios, React Router, JavaMailSender

---

## 📁 Project Structure

DevEats/
├── food-delivery-app/ # Spring Boot Backend
├── frontend/ # React Frontend
└── README.md


📸 Screenshots
<img width="1341" height="681" alt="sc1" src="https://github.com/user-attachments/assets/7502e6af-bea7-4496-87b7-ace95e0a8b75" />
<img width="1343" height="677" alt="sc2" src="https://github.com/user-attachments/assets/48930fb4-5cf3-48ee-be18-e7bf48cfd209" />
<img width="1365" height="661" alt="sc3" src="https://github.com/user-attachments/assets/3f974d71-6417-406d-a5db-b0c83e62e15e" />
<img width="1354" height="658" alt="sc4" src="https://github.com/user-attachments/assets/e5d38a11-3554-46ac-8860-d60f9312ec4e" />
<img width="1364" height="680" alt="sc5" src="https://github.com/user-attachments/assets/51e55773-61b1-4cc7-9ea4-c578c59f1e22" />



---

## ✨ Features

- ✅ User Sign-up & Login with OTP verification (email-based)
- ✅ Forgot Password (email OTP + secure reset)
- ✅ Browse all restaurant brands on the Home Page
- ✅ View dynamic restaurant menus and food items
- ✅ Add/remove items from Cart
- ✅ Full Payment flow with taxes, platform and delivery fees
- ✅ Order Confirmation page with summary
- ✅ "My Orders" history for logged-in users
- ✅ Reorder from past orders with 1 click
- ✅ Detailed View for each order

---

## 🛠️ Getting Started – Run DevEats Locally

Follow this step-by-step guide to clone and run the project on your local machine.

### 📆 Prerequisites

Make sure the following tools are installed:

#### 🔧 Frontend  
- [Node.js](https://nodejs.org/) (v16 or higher) – Includes npm  
- Code Editor (e.g., [VS Code](https://code.visualstudio.com/))  
- VS Code Extensions:
  - Prettier (optional)
  - ES7+ React Snippets (optional)

#### 🧹 Backend  
- [Java JDK 17+](https://adoptium.net/)  
- [Spring Boot](https://spring.io/projects/spring-boot) (via your IDE like IntelliJ or Eclipse)  
- [MySQL](https://dev.mysql.com/downloads/mysql/) (with a database named `fooddelivery`)  
- IDE: IntelliJ IDEA (recommended) or Eclipse  
- Postman (optional for API testing)

---

### 🔗 1. Clone the Repository

```bash
git clone https://github.com/your-username/DevEats.git
cd DevEats
```

📌 To contribute, fork the repo first → clone your fork → and then make a Pull Request (PR) from your branch.

---

### ⚙️ 2. Backend Setup (Spring Boot)

1. Open the `food-delivery-app` directory in IntelliJ or Eclipse.
2. Make sure MySQL is running and you have a database named `fooddelivery`.
3. In `src/main/resources/application.properties`, configure your DB credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fooddelivery
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. Run the main class:

```java
FoodDeliveryAppApplication.java
```

📝 If you're new to Spring Boot, check this quick guide:  
👉 [How to setup Spring Boot](https://spring.io/quickstart)

---

### 🌐 3. Frontend Setup (React)

1. Open the `frontend` folder in your terminal.
2. Install dependencies:

```bash
npm install
```

3. Start the frontend server:

```bash
npm start
```

The app will run on [http://localhost:3000](http://localhost:3000)

---

### 🧲 Testing the App

Once both backend (port 8080) and frontend (port 3000) are running:

- Visit http://localhost:3000 to view the app.
- Sign up, log in, browse restaurants, place orders, and test all features.

---




👨‍💻 Developer
Made with ❤️ by Mirsab Hussain N
