
# 大学生能力培养体系平台

## 1 前端部分
### 1.1 安装node_modules依赖
```
# 安装依赖
npm install
# 运行项目
npm run dev
```

## 2 Git 部分
### 2.1 生成 ssh key
```
# 生成
ssh-keygen -t rsa -C "xxxx@xx.xx"
# 复制
cat ~/.ssh/id_rsa.pub

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

```
## 3 待解决问题
- 视图部分 Views 视图的 model mapper mapper.xml未创建
