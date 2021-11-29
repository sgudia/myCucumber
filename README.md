# myCucumber
This is my BDD cucumber project
hello 

zsh: command not found: git
Ctrl+r -->
swathigudia@swathigudiasMBP myCucumber % export PATH="/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Java/JavaVirtualMachines/jdk-17.0.1.jdk/Contents/Home:/Users/swathigudia/libs/apache-maven-3.8.3/bin:/usr/bin/git"
git master branch is  --> * main
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git config --global user.name"sgudia"                    
swathigudia@swathigudiasMBP myCucumber % git config --global user.email"Sgudia939@gmail.com"      
swathigudia@swathigudiasMBP myCucumber % git config --global user.password"Myworkspace$5"         
swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
remote: Permission to sgudia/myCucumber.git denied to vm31.
/////////////////////////////////
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git remote -v
origin  https://github.com/sgudia/myCucumber.git (fetch)
origi
n  https://github.com/sgudia/myCucumber.git (push)

git push git@github.com:sgudia/myCucumber.git    git
git@github.com: Permission denied (publickey).
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists. 

//////////Delete git credentials and add new acct////////////

git config --global credential.helper
git config --global credential.helper store
git credential-osxkeychain erase
host=github.com
protocol=https
git config --global --list                               
user.password=Myworkspace
credential.helper=store
git config --global user.name"sgudia"
git config --global user.password"Myworkspace$5"         
git config --global user.email"Sgudia939@gmail.com"
git push --set-upstream origin feature/login      
Username for 'https://github.com': sgudia
Password for 'https://sgudia@github.com': password (personal access token )

Enumerating objects: 20, done.
Counting objects: 100% (20/20), done.
Delta compression using up to 4 threads
Compressing objects: 100% (16/16), done.
Writing objects: 100% (18/18), 2.13 KiB | 727.00 KiB/s, done.
Total 18 (delta 4), reused 0 (delta 0), pack-reused 0

remote: Resolving deltas: 100% (4/4), done.
remote: Create a pull request for 'feature/login' on GitHub by visiting:
remote:      https://github.com/sgudia/myCucumber/pull/new/feature/login
remote:
To https://github.com/sgudia/myCucumber.git
* [new branch]      feature/login -> feature/login
  Branch 'feature/login' set up to track remote branch 'feature/login' from 'origin'.
  swathigudia@swathigudiasMBP myCucumber % git branch
* feature/login
  main


25/12/21
locator unstable ga unnapudu???

-->element number will be unique for each shopping cart item(ex:lego 73191) locator can be traced using its unique product no.
Title of the item is same irrespective of the page it is displayed!!!
---------
run cucumber test from terminal with tag:
 mvn test -Dcucumber.options="--tags @cart"



