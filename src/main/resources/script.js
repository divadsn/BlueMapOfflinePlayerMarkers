let smallIcons = false;

bluemap.events.addEventListener("bluemapCameraMoved", event => {
    let farAway = event.detail.controlsManager.distance > 1000;
    if (smallIcons !== farAway) {
        smallIcons = farAway;

        let elements = document.getElementsByClassName("bmopm-offline-player");
        for (let i = 0; i < elements.length; i++) {
            let el = elements.item(i);
            let icon = el.getElementsByClassName("bm-marker-poi-icon").item(0);
            if (farAway) {
                icon.classList.add("bmopm-small");
            } else {
                icon.classList.remove("bmopm-small");
            }
        }
    }
});