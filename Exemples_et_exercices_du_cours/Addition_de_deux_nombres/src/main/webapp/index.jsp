<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculateur Spring Boot</title>
    <!-- Importation de Tailwind CSS pour un design moderne -->
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-indigo-50 to-blue-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100">
        <div class="text-center mb-6">
            <span class="bg-indigo-100 text-indigo-700 text-xs font-semibold px-3 py-1 rounded-full uppercase tracking-wider">Spring Boot v6</span>
            <h1 class="text-2xl font-bold text-gray-800 mt-2">Addition de Nombres</h1>
            <p class="text-sm text-gray-500">Entrez deux valeurs pour calculer leur somme</p>
        </div>

        <form action="add" method="get" class="space-y-4">
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Enter 1st number :</label>
                <input type="number" name="num1" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:outline-none transition">
            </div>
            
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Enter 2nd number :</label>
                <input type="number" name="num2" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:outline-none transition">
            </div>

            <button type="submit" 
                class="w-full bg-indigo-600 hover:bg-indigo-700 text-white font-semibold py-2.5 rounded-lg shadow-md transition duration-200">
                Envoyer
            </button>
        </form>
    </div>
</body>
</html>