import kotlinx.browser.document
import kotlinx.html.*
import kotlinx.html.dom.append
import kotlinx.html.js.*
import kotlinx.browser.document
import org.w3c.dom.HTMLImageElement

fun main() {
    val images = arrayOf(
        "https://www.chapter2cycle.sg/cdn/shop/products/New-Cervelo-Soloist-2_1800x1800.jpg?v=1705298817",
        "https://www.all3sports.com/cdn/shop/files/Caledonia-5-Ult-Di2-Glacier.jpg?v=1697212435&width=1200",
        "https://images.excelsports.com/public/large/119943-1.jpg",
        "https://i.guim.co.uk/img/media/fea0e183916bacffacc6851c14ad11614f640673/168_176_3607_2165/master/3607.jpg?width=465&dpr=1&s=none",
        "https://www.cyclingboutique.in/cdn/shop/files/Cervelo-Road-Bikes-PX-Series-Shimano-DURA-ACE-Di2-2020-DGrey-White-Black_1024x1024.jpg?v=1693288454",
        "https://images.prismic.io/cervelo/d3907466-2ef8-4714-98e6-cd3953b5c7cf_0H0PSEUI2C+PROFILE.webp?auto=compress,format",
        "https://road.cc/sites/default/files/styles/main_width/public/2024-cervelo-rouvida-4.jpeg",
        "https://velotherapy.com.au/cdn/shop/files/1_2023CERVELOASPERO5_1024x1024.png?v=1693408104",
        "https://cdn.cykelexperten.dk/media/fd/4b/67/1706713846/ride4fun.dk_images_cervelo_CerveloAspero-5RedeTapAXS1Ltd2024-Gul.png?width=3000&height=",
    )
    var currentIndex = 0

    val imgElement = document.querySelector(".carousel-image") as HTMLImageElement
    imgElement.src = images[currentIndex]

    document.getElementById("prevButton")?.addEventListener("click", {
        currentIndex = if (currentIndex > 0) currentIndex - 1 else images.size - 1
        imgElement.src = images[currentIndex]
    })

    document.getElementById("nextButton")?.addEventListener("click", {
        currentIndex = if (currentIndex < images.size - 1) currentIndex + 1 else 0
        imgElement.src = images[currentIndex]
    })
}

        {
    document.getElementById("content")?.append {
        h1 {
            +"Welcome to the World of Bicycle Sports!"
        }
        p {
            +"Bicycle sports encompass a wide range of activities, including road cycling, mountain biking, BMX, and track cycling. Each discipline offers a unique set of challenges and thrills, appealing to enthusiasts of all skill levels."
        }
        img(src = "bicycle_image_url_here", alt = "Bicycle Racing") {
            width = "600"
        }
        p {
            +"Whether you're a competitive racer or a casual rider, there's something in bicycle sports for everyone. Get on your bike and explore the joy of cycling!"
        }
    }
}
