<table>
    <tr>
        <th>${ ui.message("Item.id") }</th>
        <th>${ ui.message("Item.drugName") }</th>
        <th>${ ui.message("Item.description") }</th>
        <th>${ ui.message("Item.prescription") }</th>
        <th>${ ui.message("Item.quantity") }</th>
        <th>${ ui.message("Item.purchases") }</th>
    </tr>
    <% if (users) { %>
        <% users.each { %>
            <tr>
                <td>${ ui.format(it.id) }</td>
                <td>${ ui.format(it.drugName) }</td>
                <td>${ ui.format(it.description) }</td>
                <td>${ ui.format(it.prescription) }</td>
                <td>${ ui.format(it.quantity) }</td>
                <td>${ ui.format(it.purchases) }</td>
            </tr>
        <% } %>
    <% } else { %>
        <tr>
            <td colspan="4">${ ui.message("general.none") }</td>
        </tr>
    <% } %>
</table>