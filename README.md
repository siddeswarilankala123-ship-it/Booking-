# FunctionHallBooking
Java 17 + JSP/Servlet + JDBC + MySQL + Tomcat 10.1.

1. Run database/schema.sql in MySQL.
2. Change MySQL credentials in DBConnection.java.
3. Run `mvn clean package`.
4. Deploy target/FunctionHallBooking.war to Tomcat 10.1 webapps.
5. Open http://localhost:8080/FunctionHallBooking/
6. Login/register, choose a hall, book a date, and use the demo payment page.

Note: The payment page is a demo record flow, not a real payment gateway. Add Razorpay/Stripe/etc. only after configuring a production account.
