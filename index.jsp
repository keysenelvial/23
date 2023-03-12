<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trig Functions</title>
</head>
<body>
<h1>Trig Functions</h1>
<form action="hello-servlet" method="get">
    <p>
        <label for="angle">Angle:</label>
        <input type="number" name="angle" id="angle" required>
    </p>
    <p>
        <label for="isRadian">Unit of measurement:</label>
        <select name="isRadian" id="isRadian">
            <option value="true">Radians</option>
            <option value="false">Degrees</option>
        </select>
    </p>
    <p>
        <label for="function">Function:</label>
        <select name="function" id="function">
            <option value="sin">sin</option>
            <option value="cos">cos</option>
            <option value="tan">tan</option>
        </select>
    </p>
    <p>
        <button type="submit">Calculate</button>
    </p>
</form>
</body>
</html>