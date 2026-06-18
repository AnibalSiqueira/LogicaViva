// * Função carregar página
function loadView(viewPath) {
    fetch(viewPath)
        .then(res => res.text())
        .then(html => {
            document.querySelector('.right-dashboard').innerHTML = html;
        });
}