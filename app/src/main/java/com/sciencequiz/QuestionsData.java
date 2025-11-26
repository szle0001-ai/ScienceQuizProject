package com.sciencequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsData {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        // 1
        list.add(new Question(
                "What planet in our solar system has the strongest winds?",
                new String[]{"Earth", "Mars", "Neptune", "Venus"},
                2,
                new String[]{
                        "It is one of the outer planets.",
                        "It appears deep blue because of methane.",
                        "Winds can reach around 2,000 km/h there."
                }
        ));

        // 2
        list.add(new Question(
                "Which gas makes up most of Earth’s atmosphere?",
                new String[]{"Oxygen", "Carbon dioxide", "Nitrogen", "Helium"},
                2,
                new String[]{
                        "It makes up about 78% of the air.",
                        "It is relatively unreactive.",
                        "It is also a key part of many fertilizers."
                }
        ));

        // 3
        list.add(new Question(
                "What is the largest organ in the human body?",
                new String[]{"Heart", "Skin", "Liver", "Lungs"},
                1,
                new String[]{
                        "It protects the body from the outside world.",
                        "It can repair itself after small injuries.",
                        "It covers the entire external surface of the body."
                }
        ));

        // 4
        list.add(new Question(
                "Which metal is liquid at room temperature?",
                new String[]{"Copper", "Mercury", "Aluminium", "Iron"},
                1,
                new String[]{
                        "It was used in old thermometers.",
                        "Its chemical symbol is Hg.",
                        "It is a shiny silver liquid."
                }
        ));

        // 5
        list.add(new Question(
                "What is the hottest planet in the solar system?",
                new String[]{"Mercury", "Venus", "Mars", "Jupiter"},
                1,
                new String[]{
                        "It has a very thick atmosphere.",
                        "The atmosphere is rich in carbon dioxide.",
                        "A strong greenhouse effect makes it extremely hot."
                }
        ));

        // 6
        list.add(new Question(
                "What part of a cell contains most of the genetic information?",
                new String[]{"Mitochondria", "Nucleus", "Ribosomes", "Golgi apparatus"},
                1,
                new String[]{
                        "It is often called the control centre of the cell.",
                        "It contains the DNA.",
                        "Some cells, like red blood cells, lose it when they mature."
                }
        ));

        // 7
        list.add(new Question(
                "What is the chemical formula of table salt?",
                new String[]{"CO2", "NaCl", "H2SO4", "KCl"},
                1,
                new String[]{
                        "It contains sodium.",
                        "It contains chloride.",
                        "It is the main salt in seawater."
                }
        ));

        // 8
        list.add(new Question(
                "Which planet is known for its prominent ring system?",
                new String[]{"Mars", "Saturn", "Uranus", "Neptune"},
                1,
                new String[]{
                        "It is a gas giant.",
                        "Its rings are made mostly of ice and rock.",
                        "It is the second-largest planet in the solar system."
                }
        ));

        // 9
        list.add(new Question(
                "What is the approximate speed of light in a vacuum?",
                new String[]{"3,000 km/s", "30,000 km/s", "300,000 km/s", "3,000,000 km/s"},
                2,
                new String[]{
                        "It appears in Einstein’s famous equation E = mc².",
                        "The symbol for it is 'c'.",
                        "It is about 299,792 km/s."
                }
        ));

        // 10
        list.add(new Question(
                "What is the smallest unit of life that can function independently?",
                new String[]{"Atom", "Cell", "Molecule", "Tissue"},
                1,
                new String[]{
                        "All living organisms are made from these units.",
                        "They can grow and divide.",
                        "They contain organelles like mitochondria."
                }
        ));

        // 11
        list.add(new Question(
                "Which planet has a day that is longer than its year?",
                new String[]{"Earth", "Jupiter", "Venus", "Uranus"},
                2,
                new String[]{
                        "It rotates very slowly.",
                        "It also rotates in the opposite direction to most planets.",
                        "It is sometimes called Earth’s 'sister planet'."
                }
        ));

        // 12
        list.add(new Question(
                "What is the largest volcano in the solar system?",
                new String[]{"Mauna Loa", "Mount Everest", "Olympus Mons", "Etna"},
                2,
                new String[]{
                        "It is not located on Earth.",
                        "It is found on Mars.",
                        "It is about three times taller than Mount Everest."
                }
        ));

        // 13
        list.add(new Question(
                "What does DNA stand for?",
                new String[]{"Deoxyribonucleic Acid", "Dihydronitric Acid", "Double Nitrogen Assembly", "Dynamic Nucleic Acid"},
                0,
                new String[]{
                        "It carries genetic information.",
                        "It is found in the nucleus of most cells.",
                        "Its structure is a double helix."
                }
        ));

        // 14
        list.add(new Question(
                "Which animal is famous for its ability to regenerate lost limbs?",
                new String[]{"Elephant", "Salamander", "Shark", "Penguin"},
                1,
                new String[]{
                        "It is an amphibian.",
                        "It can live both on land and in water.",
                        "It can regrow legs and tail after injury."
                }
        ));

        // 15
        list.add(new Question(
                "What is the main gas responsible for global warming?",
                new String[]{"Oxygen", "Nitrogen", "Carbon dioxide", "Helium"},
                2,
                new String[]{
                        "It is released when fossil fuels are burned.",
                        "Plants absorb it during photosynthesis.",
                        "Its increasing concentration traps more heat."
                }
        ));

        // 16
        list.add(new Question(
                "What is the approximate age of the universe?",
                new String[]{"1.4 billion years", "4.5 billion years", "13.8 billion years", "100 billion years"},
                2,
                new String[]{
                        "It is older than the Earth.",
                        "It was estimated using the cosmic microwave background.",
                        "It is about ten times older than our solar system."
                }
        ));

        // 17
        list.add(new Question(
                "Which vitamin is mainly produced in the skin when exposed to sunlight?",
                new String[]{"Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"},
                3,
                new String[]{
                        "It is important for bone health.",
                        "It helps regulate calcium levels.",
                        "Deficiency is sometimes linked to weak bones and mood changes."
                }
        ));

        // 18
        list.add(new Question(
                "What is the main function of red blood cells?",
                new String[]{"Fight infections", "Carry oxygen", "Produce hormones", "Digest food"},
                1,
                new String[]{
                        "They contain haemoglobin.",
                        "They pick up oxygen in the lungs.",
                        "They deliver oxygen to tissues all over the body."
                }
        ));

        // 19
        list.add(new Question(
                "Which planet is known as the 'Red Planet'?",
                new String[]{"Mercury", "Mars", "Jupiter", "Pluto"},
                1,
                new String[]{
                        "Its surface is covered in iron oxide.",
                        "It has the largest volcano in the solar system.",
                        "It is the fourth planet from the Sun."
                }
        ));

        // 20
        list.add(new Question(
                "What is the hardest natural substance on Earth?",
                new String[]{"Diamond", "Steel", "Quartz", "Granite"},
                0,
                new String[]{
                        "It is a form of carbon.",
                        "It is used in cutting tools.",
                        "It is formed under very high pressure deep in the Earth."
                }
        ));

        // 21
        list.add(new Question(
                "Which part of the eye controls how much light enters?",
                new String[]{"Retina", "Lens", "Cornea", "Pupil"},
                3,
                new String[]{
                        "It appears as a black circle.",
                        "It changes size in bright and dim light.",
                        "It is surrounded by the coloured iris."
                }
        ));

        // 22
        list.add(new Question(
                "What is the boiling point of water at sea level (in °C)?",
                new String[]{"50°C", "75°C", "100°C", "150°C"},
                2,
                new String[]{
                        "It is a key reference point in the Celsius scale.",
                        "At this temperature, water turns to steam.",
                        "Standard atmospheric pressure is assumed."
                }
        ));

        // 23
        list.add(new Question(
                "Which planet has the most moons (known so far)?",
                new String[]{"Mars", "Earth", "Jupiter", "Saturn"},
                3,
                new String[]{
                        "It is famous for its rings.",
                        "It is a gas giant.",
                        "Recent observations showed it has more confirmed moons than Jupiter."
                }
        ));

        // 24
        list.add(new Question(
                "What is the main component of the Sun?",
                new String[]{"Oxygen", "Hydrogen", "Carbon", "Iron"},
                1,
                new String[]{
                        "It is the lightest element.",
                        "It is used as fuel in nuclear fusion.",
                        "It combines into helium in the Sun’s core."
                }
        ));

        // 25
        list.add(new Question(
                "Which scientist proposed the three laws of motion?",
                new String[]{"Albert Einstein", "Isaac Newton", "Galileo Galilei", "Niels Bohr"},
                1,
                new String[]{
                        "He famously studied falling apples.",
                        "He also worked on gravity.",
                        "He published the book 'Principia Mathematica'."
                }
        ));

        // 26
        list.add(new Question(
                "What type of bond involves sharing of electron pairs between atoms?",
                new String[]{"Ionic bond", "Covalent bond", "Metallic bond", "Hydrogen bond"},
                1,
                new String[]{
                        "It holds together molecules like H2O.",
                        "It usually occurs between non-metals.",
                        "The electrons are shared rather than transferred."
                }
        ));

        // 27
        list.add(new Question(
                "What is the main function of the mitochondria in a cell?",
                new String[]{"Protein synthesis", "Energy production", "Cell division", "DNA storage"},
                1,
                new String[]{
                        "They are sometimes called the 'powerhouses' of the cell.",
                        "They generate ATP.",
                        "They are especially numerous in active tissues like muscles."
                }
        ));

        // 28
        list.add(new Question(
                "Which layer of the Earth lies directly below the crust?",
                new String[]{"Inner core", "Outer core", "Mantle", "Lithosphere"},
                2,
                new String[]{
                        "It is made of semi-solid rock.",
                        "Convection in this layer moves tectonic plates.",
                        "It makes up most of Earth’s volume."
                }
        ));

        // 29
        list.add(new Question(
                "Which gas do plants mainly take in from the air for photosynthesis?",
                new String[]{"Nitrogen", "Oxygen", "Carbon dioxide", "Argon"},
                2,
                new String[]{
                        "Humans and animals exhale it.",
                        "Its concentration is rising due to human activity.",
                        "Plants use it to build sugars."
                }
        ));

        // 30
        list.add(new Question(
                "What is the freezing point of pure water at standard pressure (in °C)?",
                new String[]{"-50°C", "0°C", "10°C", "32°C"},
                1,
                new String[]{
                        "It is another key reference point in the Celsius scale.",
                        "Below this, water turns to ice.",
                        "This is the same as 32°F."
                }
        ));

        // 31
        list.add(new Question(
                "What force keeps planets in orbit around the Sun?",
                new String[]{"Magnetism", "Friction", "Gravity", "Electric force"},
                2,
                new String[]{
                        "It acts between all objects with mass.",
                        "It becomes weaker with distance.",
                        "It was described mathematically by Newton."
                }
        ));

        // 32
        list.add(new Question(
                "Which blood type is known as the universal donor?",
                new String[]{"A", "B", "AB", "O negative"},
                3,
                new String[]{
                        "It is Rh negative.",
                        "It has no A or B antigens.",
                        "It can be given to most other blood types in emergencies."
                }
        ));

        // 33
        list.add(new Question(
                "How many chromosomes does a typical human somatic cell contain?",
                new String[]{"23", "24", "46", "48"},
                2,
                new String[]{
                        "They come in pairs.",
                        "Half of them are inherited from each parent.",
                        "They are arranged in 23 pairs."
                }
        ));

        // 34
        list.add(new Question(
                "Which branch of science studies earthquakes?",
                new String[]{"Meteorology", "Seismology", "Ecology", "Optics"},
                1,
                new String[]{
                        "It uses special instruments called seismometers.",
                        "It analyses waves that travel through the Earth.",
                        "It helps in understanding tectonic plate movement."
                }
        ));

        // 35
        list.add(new Question(
                "What is the name of the process by which plants lose water through leaves?",
                new String[]{"Respiration", "Transpiration", "Condensation", "Filtration"},
                1,
                new String[]{
                        "It mainly occurs through tiny openings called stomata.",
                        "It helps pull water up from the roots.",
                        "It is an important part of the water cycle."
                }
        ));

        // 36
        list.add(new Question(
                "Which scientist is famous for the theory of relativity?",
                new String[]{"Marie Curie", "Albert Einstein", "Max Planck", "Enrico Fermi"},
                1,
                new String[]{
                        "He developed the equation E = mc².",
                        "He worked as a patent clerk before becoming famous.",
                        "His theories changed how we understand space and time."
                }
        ));

        // 37
        list.add(new Question(
                "What is the main function of the large intestine?",
                new String[]{"Digest proteins", "Absorb water", "Produce insulin", "Filter blood"},
                1,
                new String[]{
                        "It comes after the small intestine.",
                        "Its contents are mostly undigested material.",
                        "It helps form solid faeces."
                }
        ));

        // 38
        list.add(new Question(
                "Which unit is used to measure electrical resistance?",
                new String[]{"Volt", "Ampere", "Ohm", "Watt"},
                2,
                new String[]{
                        "It is named after a German physicist.",
                        "Its symbol is the Greek letter omega (Ω).",
                        "It describes how strongly a material opposes electric current."
                }
        ));

        // 39
        list.add(new Question(
                "What type of galaxy is the Milky Way?",
                new String[]{"Elliptical galaxy", "Irregular galaxy", "Spiral galaxy", "Ring galaxy"},
                2,
                new String[]{
                        "It has a central bulge with arms.",
                        "Our solar system lies in one of its arms.",
                        "It looks like a spinning disc with spiral structure."
                }
        ));

        // 40
        list.add(new Question(
                "Which particle in the atom has a negative electric charge?",
                new String[]{"Proton", "Neutron", "Electron", "Positron"},
                2,
                new String[]{
                        "It orbits around the nucleus.",
                        "It is much lighter than protons and neutrons.",
                        "Its movement forms electric currents in wires."
                }
        ));

        return list;
    }
}