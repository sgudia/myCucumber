# myCucumber
This is my BDD cucumber project
hello 
this
er % git
zsh: command not found: git
swathigudia@swathigudiasMBP myCucumber % export PATH="/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Java/JavaVirtualMachines/jdk-17.0.1.jdk/Contents/Home:/Users/swathigudia/libs/apache-maven-3.8.3/bin:/usr/bin/git"
swathigudia@swathigudiasMBP myCucumber % git branch
* main
  swathigudia@swathigudiasMBP myCucumber % git status
  On branch main
  Your branch is up to date with 'origin/main'.

Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file:   data.properties

Untracked files:
(use "git add <file>..." to include in what will be committed)
.idea/

swathigudia@swathigudiasMBP myCucumber % git checkout -b feature/login
Switched to a new branch 'feature/login'
swathigudia@swathigudiasMBP myCucumber % gitbranch
zsh: command not found: gitbranch
swathigudia@swathigudiasMBP myCucumber % git status                   
On branch feature/login
Changes to be committed:
(use "git restore --staged <file>..." to unstage)
new file:   data.properties

Untracked files:
(use "git add <file>..." to include in what will be committed)
.idea/

swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push                 
[feature/login 6b1dbd9] my first commit
Committer: swathigudia <swathigudia@swathigudiasmbp.home>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

7 files changed, 42 insertions(+)
create mode 100644 .idea/.gitignore
create mode 100644 .idea/misc.xml
create mode 100644 .idea/modules.xml
create mode 100644 .idea/myCucumber.iml
create mode 100644 .idea/runConfigurations.xml
create mode 100644 .idea/vcs.xml
create mode 100644 data.properties
fatal: The current branch feature/login has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature/login

swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git config --global user.name"sgudia"                   
swathigudia@swathigudiasMBP myCucumber % git config --global user.email"Sgudia939@gmail.com"                        
swathigudia@swathigudiasMBP myCucumber % git config --global user.password"Myworkspace$5"
swathigudia@swathigudiasMBP myCucumber % git clone https://github.com/sgudia/myCucumber.git       
Cloning into 'myCucumber'...
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (4/4), done.
swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
warning: adding embedded git repository: myCucumber
hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint:   git submodule add <url> myCucumber
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint:   git rm --cached myCucumber
hint:
hint: See "git help submodule" for more information.
[feature/login 2f02237] my first commit
Committer: swathigudia <swathigudia@swathigudiasmbp.home>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

1 file changed, 1 insertion(+)
create mode 160000 myCucumber
fatal: The current branch feature/login has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature/login

swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git config --global user.name"sgudia"                    
swathigudia@swathigudiasMBP myCucumber % git config --global user.password"Myworkspace$5"         
swathigudia@swathigudiasMBP myCucumber % git config --global user.email"Sgudia939@gmail.com"      
swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
On branch feature/login
nothing to commit, working tree clean
swathigudia@swathigudiasMBP myCucumber % git branch
* feature/login
  main
  swathigudia@swathigudiasMBP myCucumber % git status
  On branch feature/login
  nothing to commit, working tree clean
  swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
  On branch feature/login
  nothing to commit, working tree clean
  swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
  [feature/login 02e7210] my first commit
  Committer: swathigudia <swathigudia@swathigudiasmbp.home>
  Your name and email address were configured automatically based
  on your username and hostname. Please check that they are accurate.
  You can suppress this message by setting them explicitly:

  git config --global user.name "Your Name"
  git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

1 file changed, 1 insertion(+)
fatal: The current branch feature/login has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature/login

swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git config --global user.name"sgudia"                    
swathigudia@swathigudiasMBP myCucumber % git config --global user.email"Sgudia939@gmail.com"      
swathigudia@swathigudiasMBP myCucumber % git config --global user.password"Myworkspace$5"         
swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
On branch feature/login
nothing to commit, working tree clean
swathigudia@swathigudiasMBP myCucumber % git status
On branch feature/login
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md

no changes added to commit (use "git add" and/or "git commit -a")
swathigudia@swathigudiasMBP myCucumber % git add . && git commit -m "my first commit" && git push
[feature/login 337b9cb] my first commit
Committer: swathigudia <swathigudia@swathigudiasmbp.home>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

1 file changed, 2 insertions(+), 1 deletion(-)
fatal: The current branch feature/login has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature/login

swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login             
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber %
swathigudia@swathigudiasMBP myCucumber %
swathigudia@swathigudiasMBP myCucumber %
swathigudia@swathigudiasMBP myCucumber %
swathigudia@swathigudiasMBP myCucumber %
swathigudia@swathigudiasMBP myCucumber % git config credential.helper store
swathigudia@swathigudiasMBP myCucumber % git config credential.helper store                       
swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git help
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
[--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
[-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
[--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
<command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
clone             Clone a repository into a new directory
init              Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
add               Add file contents to the index
mv                Move or rename a file, a directory, or a symlink
restore           Restore working tree files
rm                Remove files from the working tree and from the index
sparse-checkout   Initialize and modify the sparse-checkout

examine the history and state (see also: git help revisions)
bisect            Use binary search to find the commit that introduced a bug
diff              Show changes between commits, commit and working tree, etc
grep              Print lines matching a pattern
log               Show commit logs
show              Show various types of objects
status            Show the working tree status

grow, mark and tweak your common history
branch            List, create, or delete branches
commit            Record changes to the repository
merge             Join two or more development histories together
rebase            Reapply commits on top of another base tip
reset             Reset current HEAD to the specified state
switch            Switch branches
tag               Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
fetch             Download objects and refs from another repository
pull              Fetch from and integrate with another repository or a local branch
push              Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
See 'git help git' for an overview of the system.
swathigudia@swathigudiasMBP myCucumber % git push https://github.com/sgudia/myCucumber.git
remote: Permission to sgudia/myCucumber.git denied to vm31.
fatal: unable to access 'https://github.com/sgudia/myCucumber.git/': The requested URL returned error: 403
swathigudia@swathigudiasMBP myCucumber % git remote -v
origin  https://github.com/sgudia/myCucumber.git (fetch)
origin  https://github.com/sgudia/myCucumber.git (push)
swathigudia@swathigudiasMBP myCucumber % git push git@github.com:sgudia/myCucumber.git    
git@github.com: Permission denied (publickey).
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
swathigudia@swathigudiasMBP myCucumber % git config --global credential.helper
swathigudia@swathigudiasMBP myCucumber % git config --global credential.helper store
swathigudia@swathigudiasMBP myCucumber % git credentials-oskeychain erase
git: 'credentials-oskeychain' is not a git command. See 'git --help'.

The most similar command is
credential-osxkeychain
swathigudia@swathigudiasMBP myCucumber % git credentials-osxkeychain erase
git: 'credentials-osxkeychain' is not a git command. See 'git --help'.

The most similar command is
credential-osxkeychain
swathigudia@swathigudiasMBP myCucumber % git credential-osxkeychain erase
host=github.com
protocol=https

swathigudia@swathigudiasMBP myCucumber % git config --global --list                               
user.password=Myworkspace
credential.helper=store
swathigudia@swathigudiasMBP myCucumber % git config --global user.name"sgudia"                    
swathigudia@swathigudiasMBP myCucumber % git config --global user.password"Myworkspace$5"         
swathigudia@swathigudiasMBP myCucumber % git config --global user.email"Sgudia939@gmail.com"      
swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login      
Username for 'https://github.com': sgudia
Password for 'https://sgudia@github.com':
remote: Support for password authentication was removed on August 13, 2021. Please use a personal access token instead.
remote: Please see https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ for more information.
fatal: Authentication failed for 'https://github.com/sgudia/myCucumber.git/'
swathigudia@swathigudiasMBP myCucumber % git push --set-upstream origin feature/login       
Username for 'https://github.com': sgudia
Password for 'https://sgudia@github.com':
Enumerating objects: 20, done.
Counting objects: 100% (20/20), done.
Delta compression using up to 4 threads
Compressing objects: 100% (16/16), done.
Writing objects: 100% (18/18), 2.13 KiB | 727.00 KiB/s, done.
Total 18 (delta 4), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (4/4), done.
remote:
remote: Create a pull request for 'feature/login' on GitHub by visiting:
remote:      https://github.com/sgudia/myCucumber/pull/new/feature/login
remote:
To https://github.com/sgudia/myCucumber.git
* [new branch]      feature/login -> feature/login
  Branch 'feature/login' set up to track remote branch 'feature/login' from 'origin'.
  swathigudia@swathigudiasMBP myCucumber % git branch
* feature/login
  main
