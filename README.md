
# VVnT API Documentation

Welcome to the VVnT API documentation, showcasing the innovative backend code developed by Saurabh Maurya for VVnT Organization. Powered by SpringBoot, this code reflects precision and excellence, offering a seamless and robust experience. Dive into the realm of VVnT and witness Saurabh Maurya's vision, where every line of code signifies dedication, brilliance, and a commitment to unparalleled performance.

## Contact Information
- **Developer:** Saurabh Maurya
- **Website:** [VVnT](https://vvnt.netlify.app/)
- **Email:** [saurabhmaurya.in@gmail.com](mailto:saurabhmaurya.in@gmail.com)
- **License:** [OPEN License](https://quikbazaar.netlify.app/)
  
## API Documentation External Docs
For additional information, please refer to our [external documentation](https://github.com/saurabhm1).

## API Base URL
[http://vvnt.up.railway.app](http://vvnt.up.railway.app) - Generated server URL.

## Table of Contents
1. [UserController](#usercontroller)
   - [Get Single User by UserId](#get-single-user-by-userid)
   - [Update User](#update-user)
   - [Delete User](#delete-user)
   - [Get All Users](#get-all-users)
   - [Create New User](#create-new-user)
   - [Serve User Image](#serve-user-image)
   - [Upload User Image](#upload-user-image)
   - [Search Users](#search-users)
   - [Get User by Email](#get-user-by-email)
   - [Get Current User](#get-current-user)
2. [AuthController](#authcontroller)
   - [Login](#login)
   - [Login with Google](#login-with-google)
   - ... (The rest of the AuthController operations follow a similar pattern)

---

## UserController

### Get Single User by UserId
- **Endpoint:** `/users/{userId}`
- **Method:** `GET`
- **Parameters:**
  - `{userId}`: User ID (String)
- **Response:**
  ```json
  {
    // UserDto details
  }
  ```

### Update User
- **Endpoint:** `/users/{userId}`
- **Method:** `PUT`
- **Parameters:**
  - `{userId}`: User ID (String)
- **Request Body:**
  ```json
  {
    // UserDto details
  }
  ```
- **Response:**
  ```json
  {
    // Updated UserDto details
  }
  ```

### Delete User
- **Endpoint:** `/users/{userId}`
- **Method:** `DELETE`
- **Parameters:**
  - `{userId}`: User ID (String)
- **Response:**
  ```json
  {
    "message": "User deleted successfully",
    "success": true,
    "status": "200 OK"
  }
  ```

### Get All Users
- **Endpoint:** `/users`
- **Method:** `GET`
- **Parameters:**
  - `pageNumber` (Optional): Page number (Integer, default: 0)
  - `pageSize` (Optional): Page size (Integer, default: 10)
  - `sortBy` (Optional): Sort field (String, default: "name")
  - `sortDir` (Optional): Sort direction (String, default: "asc")
- **Response:**
  ```json
  {
    // PageableResponseUserDto details
  }
  ```

### Create New User
- **Endpoint:** `/users`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    // UserDto details
  }
  ```
- **Response:**
  ```json
  {
    // New UserDto details
  }
  ```

### Serve User Image
- **Endpoint:** `/users/image/{userId}`
- **Method:** `GET`
- **Parameters:**
  - `{userId}`: User ID (String)
- **Response:**
  ```json
  {
    // User image details
  }
  ```

### Upload User Image
- **Endpoint:** `/users/image/{userId}`
- **Method:** `POST`
- **Parameters:**
  - `{userId}`: User ID (String)
- **Request Body:**
  ```json
  {
    "userImage": "base64EncodedImage"
  }
  ```
- **Response:**
  ```json
  {
    // ImageResponse details
  }
  ```

### Search Users
- **Endpoint:** `/users/search/{keywords}`
- **Method:** `GET`
- **Parameters:**
  - `{keywords}`: Search keywords (String)
  - `pageNumber` (Optional): Page number (Integer, default: 0)
  - `pageSize` (Optional): Page size (Integer, default: 10)
  - `sortBy` (Optional): Sort field (String, default: "name")
  - `sortDir` (Optional): Sort direction (String, default: "asc")
- **Response:**
  ```json
  {
    // PageableResponseUserDto details
  }
  ```

### Get User by Email
- **Endpoint:** `/users/email/{email}`
- **Method:** `GET`
- **Parameters:**
  - `{email}`: User email (String)
- **Response:**
  ```json
  {
    // UserDto details
  }
  ```

### Get Current User
- **Endpoint:** `/auth/current`
- **Method:** `GET`
- **Response:**
  ```json
  {
    // UserDto details
  }
  ```

---

## AuthController

### Login
- **Endpoint:** `/auth/login`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "email": "user@example.com",
    "password": "password123"
  }
  ```
- **Response:**
  ```json
  {
    "jwtToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
    "user": {
      // UserDto details
    }
  }
  ```
- **Security:** Bearer Token (`JWT`)

### Login with Google
- **Endpoint:** `/auth/google`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    // Google Sign-In response
  }
  ```
- **Response:**
  ```json
  {
    "jwtToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
    "user": {
      // UserDto details
    }
  }
  ```
- **Security:** Bearer Token (`JWT`)

... (The rest of the AuthController operations follow a similar pattern)

---

This documentation provides a comprehensive guide to the VVnT API. Explore and integrate to experience the seamless blend of innovation and expertise.
```

This version includes the specified addition. Feel free to use and modify it as needed

.
