
# JobsForCUETian

JobsForCUETian is a job portal designed specifically for CUET (Chittagong University of Engineering and Technology) alumni and students. Built with **Java**, **Spring Boot**, **Thymeleaf**, and **MySQL**, this platform connects job seekers with recruiters and simplifies job hunting and candidate search.

## Features

### **Job Seeker Features**
- View and search for jobs based on location, type, and preferences.
- Apply for jobs and track application status.
- Save jobs for later consideration.
- Manage personal profiles.

### **Recruiter Features**
- Post new job opportunities.
- View and manage candidate applications.
- Access detailed job activity and insights.

### **Authentication and Security**
- User authentication with Spring Security.
- Custom user roles for job seekers and recruiters.

---

## Technologies Used

- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** MySQL
- **Security:** Spring Security

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/jobsforcuetian.git
2. Navigate to the project directory:
        `cd jobsforcuetian`

3. Configure the MySQL Database:
   - Create a new MySQL database named `jobsforcuetian` by running the following SQL query:
   - Update the database credentials in `src/main/resources/application.properties` with your MySQL credentials.

Example configuration in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/jobsforcuetian
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
4. Run the application:
``` ./mvnw spring-boot:run ```

5. Access the application: Open your browser and go to http://localhost:8080.

## Project Structure

1. **Services**
   - Contains the business logic for:
     - User management
     - Job postings
     - Applications
     - Profiles

2. **Repository**
   - Defines interfaces for interacting with the database, responsible for CRUD operations.

3. **Entity**
   - Represents the models corresponding to the database tables.

 4. **Controller**
   - Handles HTTP requests and routes, interacting with services to process data and return responses.

## Screen Shot
### 1. **Home Page**
   ![Home Page ]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/HomePage.png))

### 2. **Login Register for Job Seeker and Recruiter**
   ![Register/Login Page]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/LoginPage_registerPage.png))

### 3. **Candidate Dashboard**
   ![Candidate Dashboard Page]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/Candidate%20Dashboard.png))

### 4. **Recruiter Dashboard**
   ![Recruiter Dashboard Page]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/Recruiter%20Profile%20creation%20page.png))
### 5. **Post New Jobs**
   ![Post a Job Page]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/post%20new%20job.png))

### 6. **Job Details**
   ![Job Details of a Job]([path_to_your_screenshot.png](https://github.com/flop-signing/jobsForCUETian/blob/6292e1f37700a8a688517708bd5a1e29163bfa87/photos/pages/Job%20Details%20Page'.png))
