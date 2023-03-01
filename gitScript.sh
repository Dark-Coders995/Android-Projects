#!/bin/bash

start_date="2023-03-01"
end_date="2023-03-14"

current_date=$(date -jf "%Y-%m-%d" "$start_date" +"%Y-%m-%d")

while [ "$current_date" != "$end_date" ]; do
    # Create or modify your files as needed
    echo """
    fun main() {
        println(\"Hello World in Kotlin!\")
        println(\"Current Date: $current_date\")
    }
    """ > file1.kt

    # Add files to staging
    git add .


    # Commit with amended date
    git commit -a --date="$current_date" -m "Your commit message"

    # Increment date for the next iteration
    current_date=$(date -jf "%Y-%m-%d" -v+1d "$current_date" +"%Y-%m-%d" | awk '{print $1}')
done
