<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inscription Client</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-purple-50 to-indigo-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100">
        <div class="text-center mb-6">
            <span class="bg-purple-100 text-purple-700 text-xs font-semibold px-3 py-1 rounded-full uppercase tracking-wider">Spring MVC</span>
            <h1 class="text-2xl font-bold text-gray-800 mt-2">Gestion Client</h1>
        </div>

        <form action="addClient" method="post" class="space-y-4">
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Enter your id :</label>
                <input type="number" name="id" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:outline-none transition">
            </div>
            
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Enter your name :</label>
                <input type="text" name="name" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-purple-500 focus:outline-none transition">
            </div>

            <button type="submit" 
                class="w-full bg-purple-600 hover:bg-purple-700 text-white font-semibold py-2.5 rounded-lg shadow-md transition duration-200">
                Submit
            </button>
        </form>
    </div>
</body>
</html>