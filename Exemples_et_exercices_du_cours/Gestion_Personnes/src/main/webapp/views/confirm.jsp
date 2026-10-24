<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Confirmation</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-blue-50 to-indigo-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100 text-center">
        <h1 class="text-2xl font-bold text-green-600 mb-4">Succès !</h1>
        <p class="text-gray-700 mb-6">Person named <strong>${nom} ${prenom}</strong> has been successfully added.</p>
        
        <form action="showAll" method="get">
            <button type="submit" 
                class="w-full bg-indigo-600 hover:bg-indigo-700 text-white font-semibold py-2.5 rounded-lg shadow-md transition mb-3">
                Afficher tout
            </button>
        </form>
        <form action="addPerson" method="get">
            <button type="submit" 
                class="w-full bg-gray-200 hover:bg-gray-300 text-gray-800 font-semibold py-2.5 rounded-lg transition">
                Ajouter une autre
            </button>
        </form>
    </div>
</body>
</html>