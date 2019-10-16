# ability-foster-platform
大学生能力培养体系平台

# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

# run e2e tests
npm run e2e

# run all tests
npm test

# generate ssh key
ssh-keygen -t rsa -C "xxxx@xx.xx"
cat ~/.ssh/id_rsa.pub

# use vue-cli to create project
npm install --global vue-cli
vue init webpack xxx
cd xxx
npm install
npm run dev

# npm run build

# depedencies need to be installed so far
npm install fastclick --save
npm install stylus --save
npm install stylus-loader --save
npm install vue-awesome-swiper@2.6.7 --save
npm install axios --save
npm install better-scroll --save
npm install vuex --save
npm install babel-polyfill --save

# git commands
# 查看分支状态
git status
# 查看本地分支
git branch
# 查看远程分支
git branch -r
# 查看所有分支
git branch -a

# 在本地创建分支并推送到远程仓库
# 创建分支
git branch [branch_name]
# 切换分支
git checkout [branch_name]
# 推送分支到仓库
git push origin [branch_name]

# 删除本地分支
git branch -d [branch_name]
# 删除远程分支 :代表删除
git push origin :[branch_name]

# 分支合并
git add .
git commit -m 'comment'
git push origin [branch_name]
git checkout master
git merge origin/[branch_name]
git push