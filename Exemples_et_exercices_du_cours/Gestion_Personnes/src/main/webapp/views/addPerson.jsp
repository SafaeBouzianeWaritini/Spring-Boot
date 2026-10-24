<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter une personne</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-blue-50 to-indigo-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100">
        <h2 class="text-2xl font-bold text-gray-800 mb-6 text-center">Ajouter une personne</h2>
        <form action="/addPerson" method="post" class="space-y-4">
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Nom :</label>
                <input type="text" name="nom" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:outline-none">
            </div>
            <div>
                <label class="block text-sm font-medium text-gray-700 mb-1">Prénom :</label>
                <input type="text" name="prenom" required 
                    class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:outline-none">
            </div>
            <button type="submit" 
                class="w-full bg-indigo-600 hover:bg-indigo-700 text-white font-semibold py-2.5 rounded-lg shadow-md transition">
                Envoyer
            </button>
        </form>
    </div>
</body>
</html>