package com.example.roboticsapp

import com.example.roboticsapp.RobotData

object setData {
    var Robotlist = mutableListOf<RobotData>()
    fun SetRobots():List<RobotData>{

        Robotlist.add(
            RobotData(
                1,
                "Parallel Universe",
                "Scotch Plains, New Jersey, USA",
                "78",
                "1257",
                "Team 1257 Parallel Universe is an unparalleled FIRST team that strives to inspire passion for STEM. We design and fabricate robots for the FIRST Robotics Competition (FRC) in order to develop talent in STEM and prepare a new generation of innovators, leaders, and entrepreneurs. Our aspiration is to create a community excited about STEM at the Union County Vocational-Technical Schools and beyond through FRC and our community outreach programs. We aim to create an environment where teamwork fuels creative problem solving."
            )
        )
        Robotlist.add(
            RobotData(
                2,
                "Peddie Robotics",
                "Hightstown, New Jersey, USA",
                "1",
                "5895",
                "FRC Team 5895, Peddie School Robotics, is an award-winning robotics team from Peddie School in Hightstown, New Jersey. We strive to create the next generation of leaders and innovators. The team is a part of The FIRST Robotics Competition (FRC), an international robotics competition consisting of more than 3700 teams across 28 countries. Peddie Robotics prepares students for higher education and the workforce by providing the opportunity to explore, develop, and pursue their passions. Peddie Robotics alumni are currently majoring in STEM fields at colleges and universities across the globe."
            )
        )
        Robotlist.add(
            RobotData(
                3,
                "Mechanical Mustangs",
                "Clifton, New Jersey, USA",
                "2",
                "3314",
                "We are a FIRST Robotics Competition Team 3314, The Mechanical Mustangs, located in Clifton, New Jersey. Mechanical Mustangs  won the Autonomous Award."
            )
        )
        Robotlist.add(
            RobotData(
                4,
                "Krypton Cougars",
                "Palmyra, Pennsylvania, USA",
                "3",
                "2539",
                "Krypton Cougars is made up of sub-teams who all work together to produce a new, functional robot each season, all the while being innovative and facing unique game challenges."
            )
        )
        Robotlist.add(
            RobotData(
                5,
                "The MidKnight Inventors",
                "Plainsboro, New Jersey, USA",
                "4",
                "1923",
                "The MidKnight Inventors was established in the fall of 2005. The team was started by a small group of students at WW-P High School North, but expanded in 2009 to include students from High School South as well. Today, WW-P Robotics is one of the largest co-curricular activities in the district, with over 130 student team members representing both high schools in the West Windsor-Plainsboro Regional School District, as well as a large family of other FIRST programs for grades K-8."
            )
        )
        Robotlist.add(
            RobotData(
                6,
                "Aperture",
                "Newton, New Jersey, USA",
                "5",
                "3142",
                "Our high school team “opens” new and unique possibilities to students. Our robotics team provides students an exploration of twenty-first century careers and workforce, impressing upon them the importance of STEM, gracious professionalism, and service to the community. Our team members collaborate and conceptualize with engineers and mentors, who are employed in various companies, as well as members of our community that possess an expertise encompassing a multitude of disciplines. Upon the completion of the challenge allocated for the season, a dynamic and creative partnership is maintained well beyond the build season"
            )
        )
        Robotlist.add(
            RobotData(
                7,
                "Cougar Robotics",
                "Skillman, New Jersey, USA",
                "6",
                "1403",
                "Located in Skillman, NJ, FIRST Team 1403 Cougar Robotics has been demonstrating the importance of the STEM disciplines while also developing project management, leadership and teamwork skills since 2004."
            )
        )
        Robotlist.add(
            RobotData(
                8,
                "The Metal Moose",
                "West Chester, Pennsylvania, USA",
                "7",
                "1391",
                "We are a team of thinkers. Of collaborators. Of innovators. The Metal Moose is the robotics team of Westtown School, a Pre-K to 12th Grade Quaker school in West Chester, Pennsylvania. The Metal Moose is a member of FIRST (For Inspiration and Recognition of Science and Technology), an international organization that promotes involvement in science and technology for youth of all ages."
            )
        )
        Robotlist.add(
            RobotData(
                9,
                "LUNATECS",
                "Carneys Point, New Jersey, USA",
                "8",
                "316",
                "The LuNaTeCs (Learning Under Nurturing Adults Teaching Engineering Concepts and Skills), FIRST® Team 316, became a team in 1999 at Salem  Community College with seven students and four mentors through a partnership with local businesses and educators. Our students come from high schools throughout Salem, Cumberland, and Gloucester Counties which are located in a rural, agricultural area located in the southwest corner of New Jersey. The LuNaTeCs remain one of the smaller teams in FIRST with 10-20 students. The small size of our team allows each team member to be an integral part of the robot design, build and strategy, getting “hands on” experience.  Every team member counts. In 2008 the team incorporated to a not-for-profit organization – South Jersey Robotics, Inc."
            )
        )
        Robotlist.add(
            RobotData(
                10,
                "The Pascack PI-oneers",
                "Montvale, New Jersey, USA",
                "9",
                "1676",
                "The Pascack Pi-oneers, located in Bergen County, New Jersey, are part of the Pascack Valley Regional High School District, which consists of four towns: Hillsdale, River Vale, Montvale and Woodcliff Lake. Students from Hillsdale and River Vale attend Pascack Valley High School, students from Montvale and Woodcliff Lake attend Pascack Hills High School. Team meetings are held at Pascack Hills and through the generous support of the PVRHSD Board of Education, members from Pascack Valley are transported to Pascack Hills by bus. "
            )
        )

        return Robotlist
    }

    fun getRobotList(): List<RobotData> {
        return Robotlist
    }

    fun addRobot(robot: RobotData) {
        Robotlist.add(robot)
    }

}