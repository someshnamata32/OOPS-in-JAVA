6. You are tasked with simulating a student studying different subjects for various
durations using multiple threads in Java. Each thread represents a study plan where
a student is studying a specific subject for a specified time. The student should only
be allowed to study one subject at a time, and each study session should print a
message indicating the subject and the study duration. However, you need to
ensure that when multiple study plans are running concurrently, the student does
not study two subjects at the same time. How would you design a solution to
achieve this while maintaining thread safety and ensuring proper synchronization.
Provide a Java code implementation for this solution.
Solution Hint
• Create a shared class (e.g., Student) with a method study(). Make the study() method
synchronized so only one thread can execute it at a time.
• Create multiple threads (e.g., StudyPlan) where each thread represents studying a subject.
Inside run(), call the study() method.
• Pass the same Student object to all threads.
