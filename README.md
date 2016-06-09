# vidAnnotate

I am creating a GUI to view multiple (~8) videos at once, all controlled by a single set of controls (play/pause, rewind, fast forward, and a bar with a slider on it to see where you are in the video and be able to click anywhere on the bar and go to that spot in the video). Right now the videos I am using are the same video eight times of a stopwatch, to check for lag. I want it relatively synced. Very slight lag is okay, but if you experience significant lag I would suggest decreasing the image size of the video. I used an application called HandBrake.

Ideally, the videos will be footage from different angles of a room. I want the user to be able to manually draw red boxes around behaviour they deem interesting on each angle that the behaviour is visible. They would be able to specify the duration that the box is on screen (preusmably the duration of the interesting behaviour). For now, we will assume that the behaviour remains in one place and will not worry about tracking.

I will also need a save function so that the user can save their progress and not have to redraw the boxes once they close out the application. I also need a load function to load the videos they want to view. Ideally the layout would be able to look nice with different numbers of videos.

Right now, everything is hardcoded, and I will eventually need to find a way to code it dynamically. I am currently working on the buttons, and possibly maintaining the aspect ratio of the videos if the user decides to change the size of the window.
