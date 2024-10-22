package com.example.baguioguide

object DataSource {
    val attractions = listOf(
        Attraction(
            name = "BenCab Museum",
            description = "This museum is dedicated to the works of National Artist Benedicto Cabrera. It features contemporary art and traditional Cordilleran art, set against a backdrop of lush gardens and scenic views. The museum also hosts workshops and exhibits from various artists.",
            location = "Km. 6 Asin Road, Tadiangan, Tuba, Benguet",
            hours = "Tuesday to Sunday, 9 AM - 6 PM",
            fee = "Php 150 (discounts for students and seniors)",
            additionalInfo = "The museum has a café that serves local delicacies and refreshments.",
            imageResId = R.drawable.bencab
        ),
        // Add more attractions here
    )

    val activities = listOf(
        Activity(
            name = "Burnham Park",
            description = "Burnham Park is a sprawling urban park designed by American architect Daniel Burnham. It features a large man-made lake where visitors can rent paddle boats or enjoy leisurely walks around beautifully landscaped gardens. The park is ideal for picnics or simply relaxing amidst nature.",
            location = "Central Baguio",
            entranceFee = "Free",
            activities = "In addition to boating, visitors can rent bicycles to explore the park or enjoy outdoor games at designated areas. There are also playgrounds for children.",
            imageResId = R.drawable.burnham
        ),
        Activity(
            name = "Mines View Park",
            description = "Mines View Park offers breathtaking panoramic views of the surrounding mountains and valleys. It's one of Baguio's most popular tourist spots due to its stunning scenery and photo opportunities. Visitors can also learn about Baguio's mining history through informative displays.",
            location = "Mines View, Baguio City",
            entranceFee = "Free",
            activities = "Aside from enjoying the view, visitors can try on traditional Igorot attire for memorable photos or shop at local stalls selling handicrafts and souvenirs like woven products and fresh strawberries.",
            imageResId = R.drawable.minesview
        ),
        Activity(
            name = "Mirador Hill and Eco Park",
            description = "This eco park is known for its tranquil environment and natural beauty. It features hiking trails that lead to various viewpoints where visitors can enjoy serene landscapes away from the city's hustle and bustle.",
            location = "Dominican Hill, Baguio City",
            entranceFee = "Php 100 (free for children under 12)",
            activities = "Visitors can hike along well-maintained trails that offer different levels of difficulty. There are also meditation areas designed for relaxation amidst nature. Guided nature walks are available for those interested in learning more about local flora and fauna.",
            imageResId = R.drawable.mirador
        ),
        Activity(
            name = "Botanical Garden",
            description = "The Botanical Garden showcases a wide variety of plants native to Baguio and other regions in the Philippines. It's designed as a peaceful retreat where visitors can learn about plant species while enjoying scenic walks through beautifully landscaped areas.",
            location = "Leonard Wood Road, Baguio City",
            entranceFee = "Free",
            activities = "Perfect for leisurely strolls or picnics; there are also designated areas for children to play. The garden often hosts flower shows during peak seasons, displaying vibrant blooms unique to Baguio's climate.",
            imageResId = R.drawable.botanical
        )
    )

    val diningOptions = listOf(
        Dining(
            name = "Good Taste",
            specialty = "Good Taste is famous for its generous portions at very reasonable prices. It's particularly popular among students and locals looking for delicious comfort food without breaking the bank.",
            location = "Otek Street, Baguio City",
            priceRange = "Budget-friendly",
            imageResId = R.drawable.goodtaste
        ),
        Dining(
            name = "Oh My Gulay!",
            specialty = "This vegetarian restaurant stands out not only for its healthy offerings but also for its artistic ambiance filled with colorful murals created by local artists.",
            location = "Session Road, Baguio City",
            priceRange = "Mid-range",
            imageResId = R.drawable.omg
        ),
        Dining(
            name = "Lemon and Olives",
            specialty = "Known for serving authentic Greek cuisine in an inviting atmosphere decorated with Mediterranean-inspired elements.",
            location = "26 Outlook Drive South, Baguio City",
            priceRange = "Mid-range to High-end",
            imageResId = R.drawable.lemon
        ),
        Dining(
            name = "Canto Bogchi Joint",
            specialty = "Canto Bogchi Joint has gained popularity among locals and tourists alike due to its mouthwatering ribs that are tenderly cooked until they fall off the bone.",
            location = "25 Kisad Road, Baguio City",
            priceRange = "Mid-range",
            imageResId = R.drawable.canto
        )
    )

    val shoppingExperiences = listOf(
        Shopping(
            name = "Session Road",
            description = "As Baguio's main commercial street, Session Road is lined with shops offering everything from local handicrafts to clothing items at reasonable prices. It's also home to various cafés where you can take breaks while shopping.",
            location = "Session Road, Baguio City",
            additionalInfo = "Look out for unique souvenirs like woven products from local artisans or fresh produce such as strawberries sold by street vendors during peak seasons.",
            imageResId = R.drawable.session
        ),
        Shopping(
            name = "Baguio Night Market",
            description = "A vibrant night market that springs up every evening along Harrison Road; it's famous for its affordable clothing items, accessories, street food stalls serving local delicacies like fish balls, hotdogs on sticks, and more.",
            location = "Harrison Road, Baguio City",
            additionalInfo = "Bargaining is common here; don't hesitate to negotiate prices! Arrive early in order to get first dibs on popular items before they sell out.",
            imageResId = R.drawable.night
        ),
        Shopping(
            name = "Easter Weaving Room",
            description = "A cooperative dedicated to preserving traditional weaving techniques while providing livelihoods for local artisans. Visitors can watch live demonstrations of weaving processes using traditional looms.",
            location = "Easter Road, Baguio City",
            additionalInfo = "Purchase unique woven products such as bags, table runners, or blankets directly from artisans; these make great gifts or keepsakes while supporting local craftsmanship.",
            imageResId = R.drawable.weave
        )
    )

    val culturalAttractions = listOf(
        Attraction(
            name = "BenCab Museum",
            description = "The BenCab Museum is not just a showcase of the works of National Artist Benedicto Cabrera; it is a cultural hub that promotes the arts in the Cordillera region. The museum features a collection of contemporary art, indigenous artifacts, and installations that reflect the rich heritage and artistry of Filipino culture. The museum's architecture harmonizes with its natural surroundings, making it a serene place to appreciate art.",
            location = "Situated in Tadiangan, about 15 minutes from the city center, it offers stunning views of the mountains and valleys. The journey to the museum is as enjoyable as the destination itself.",
            hours = "Open from Tuesday to Sunday, 9 AM - 6 PM, allowing visitors ample time to explore.",
            fee = "Php 150 for adults, with discounts available for students and senior citizens.",
            additionalInfo = "The museum café serves local dishes and refreshments, perfect for a relaxing break after touring the exhibits. Special events and art workshops are often held, providing opportunities for hands-on learning.",
            imageResId = R.drawable.bencab
        ),
        Attraction(
            name = "Baguio Museum",
            description = "This museum serves as a repository of Baguio's history and culture. It features various exhibits that include photographs, artifacts, and dioramas that depict the city's evolution from a small settlement to a bustling urban center. The recent renovations have made the space more interactive and engaging for visitors of all ages.",
            location = "Conveniently located on Gov. Pack Road, it is easily accessible from other attractions in the city.",
            hours = "Open from Tuesday to Sunday, 9 AM - 5 PM.",
            fee = "Php 40 per person, making it an affordable option for families and groups.",
            additionalInfo = "Guided tours can be arranged in advance for educational groups or those interested in a more in-depth understanding of Baguio's history.",
            imageResId = R.drawable.baguio_museum
        ),
        Attraction(
            name = "Tam-Awan Village",
            description = "Tam-Awan Village is an artist's village that celebrates Cordilleran culture through art and community. Visitors can explore traditional huts made from indigenous materials, view local artworks, and participate in workshops that teach traditional crafts like weaving and pottery.",
            location = "Nestled along Long Long Benguet Road, it's about a 10-minute drive from the city center.",
            hours = "",
            fee = "Php 50 per person.",
            additionalInfo = "Regular workshops are offered on weekends where visitors can learn about local crafts directly from artisans. The village also hosts art exhibits featuring both established and emerging artists. The village is often used for cultural events and festivals, providing a vibrant atmosphere filled with music and dance.",
            imageResId = R.drawable.tamawan
        ),
        Attraction(
            name = "Museo Kordilyera",
            description = "This museum focuses on the diverse cultures of the Cordillera region. It houses an extensive collection of artifacts, textiles, and artworks that represent various indigenous groups. The exhibits are designed to educate visitors about the rich heritage of the area.",
            location = "Located within the University of the Philippines Baguio campus, it's easily accessible for students and tourists alike.",
            hours = "Daily (specific hours may vary).",
            fee = "",
            additionalInfo = "The museum often collaborates with local communities to host cultural events and workshops that promote awareness of indigenous traditions.",
            imageResId = R.drawable.museo
        )
    )
}
