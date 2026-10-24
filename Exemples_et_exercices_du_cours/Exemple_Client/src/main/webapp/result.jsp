<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Résultat Client</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-purple-50 to-indigo-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100 text-center">
        <div class="inline-flex items-center justify-center w-16 h-16 bg-purple-100 text-purple-600 rounded-full mb-4 text-2xl font-bold">
            👤
        </div>
        <h1 class="text-2xl font-bold text-gray-800 mb-2">Profil Enregistré</h1>
        
        <div class="bg-gray-50 p-4 rounded-xl my-4 text-left border border-gray-100 space-y-2">
            <p class="text-sm text-gray-700"><strong>Nom :</strong> ${c1.name}</p>
            <p class="text-sm text-gray-700"><strong>ID :</strong> ${c1.id}</p>
            <hr class="border-gray-200 my-2">
        </div>

        <a href="/" 
            class="inline-block w-full bg-gray-800 hover:bg-gray-900 text-white font-semibold py-2.5 rounded-lg shadow-md transition duration-200 text-center">
            Retour
        </a>
    </div>
</body>
</html>