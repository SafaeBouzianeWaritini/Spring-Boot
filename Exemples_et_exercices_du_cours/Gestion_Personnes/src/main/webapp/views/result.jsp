<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des personnes</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gradient-to-br from-blue-50 to-indigo-100 min-h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-2xl shadow-xl w-96 border border-gray-100">
        <h1 class="text-2xl font-bold text-gray-800 mb-4 text-center">List of persons</h1>
        
        <div class="space-y-2 mb-6 max-h-60 overflow-y-auto">
            <c:forEach items="${personnes}" var="personne">
                <div class="p-3 bg-gray-50 border border-gray-100 rounded-lg text-gray-700 font-medium">
                    <c:out value="${personne.prenom} ${personne.nom}" />
                </div>
            </c:forEach>
        </div>

        <form action="/addPerson" method="get">
            <button type="submit" 
                class="w-full bg-indigo-600 hover:bg-indigo-700 text-white font-semibold py-2.5 rounded-lg shadow-md transition text-center">
                Ajouter une personne
            </button>
        </form>
    </div>
</body>
</html>