function lojas(){
    const black = document.createElement("div");
    black.setAttribute("id","black");
    black.setAttribute("class", "fullopacity");
    document.body.appendChild(black);

    const lojas = document.createElement("div");
    lojas.setAttribute("id","lojas");
    document.getElementById("black").appendChild(lojas);

    const fechar = document.createElement("button");
    fechar.setAttribute("id","fechar");
    fechar.innerText = "X"
    fechar.onclick = ()=>{
        document.getElementById("black").style.opacity = '0'
        setTimeout(()=>{
            document.getElementById("black").remove();
        }, 700)
    };
    document.getElementById("lojas").appendChild(fechar);

}
