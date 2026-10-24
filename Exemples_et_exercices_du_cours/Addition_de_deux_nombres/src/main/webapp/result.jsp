<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Résultat du Calcul</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-indigo-50 to-blue-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100 text-center">
        <div class="inline-flex items-center justify-center w-16 h-16 bg-green-100 text-green-600 rounded-full mb-4 text-2xl font-bold">
            ✓
        </div>
        <h1 class="text-2xl font-bold text-gray-800 mb-2">Résultat</h1>
        
        <div class="bg-gray-50 p-4 rounded-xl my-4 border border-gray-100">
            <p class="text-sm text-gray-500">La somme obtenue est :</p>
            <p class="text-3xl font-extrabold text-indigo-600 mt-1">${num3}</p>
        </div>

        <a href="/" 
            class="inline-block w-full bg-gray-800 hover:bg-gray-900 text-white font-semibold py-2.5 rounded-lg shadow-md transition duration-200 text-center">
            Retour à l'accueil
        </a>
    </div>
</body>
</html>