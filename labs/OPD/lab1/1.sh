# * Ildar Khakimov P3114
# * Var. 14014
# * Delete old files and catalogs

chmod -R 700 .
rm -rf *

# * Part 1 | Create tree

touch gabite5 silcoon4 teddiursa6
echo "satk=5 sdef=6 spd=8" > gabite5
echo -e "Развитые\nспособности Battle Armor" > silcoon4
echo "satk=5 sdef=5 spd=4" > teddiursa6

mkdir litwick0
    mkdir litwick0/leafeon litwick0/hydreigon
    touch litwick0/snivy
    echo "Тип диеты" > litwick0/snivy

mkdir mismagius1
    mkdir mismagius1/gabite mismagius1/poliwrath
    touch mismagius1/mothim mismagius1/snivy
    echo "satk=9 sdef=5 spd=7" > mismagius1/mothim
    echo -e "weight=17.9 height=24.0\natk=5 def=6" > mismagius1/snivy

mkdir seel8
    mkdir seel8/rufflet seel8/dusclops
    touch seel8/gurdurr seel8/graveler
    echo -e "Возможности Overland=7 Surface=5 Jump=4 Power=5\nIntelligence=3" > seel8/gurdurr
    echo -e "Возможности Overland=7 Burrow=4 Jump=2\nPower=3 Intelligence=2 Groundshaper=0 Sinker=0" > seel8/graveler

# * Part 2 | Set permissions

chmod 404 gabite5
chmod 620 silcoon4
chmod 060 teddiursa6

chmod 311 litwick0
chmod 770 litwick0/leafeon
chmod 736 litwick0/hydreigon
chmod 046 litwick0/snivy

chmod 771 mismagius1
chmod 764 mismagius1/gabite
chmod 375 mismagius1/poliwrath
chmod 046 mismagius1/mothim
chmod 044 mismagius1/snivy

chmod u=wx,g=rwx,o=rx seel8
chmod u=wx,g=x,o=w seel8/rufflet
chmod u=wx,g=rwx,o=wx seel8/dusclops
chmod u=rw,g=w,o=r seel8/gurdurr
chmod u=r,g=,o= seel8/graveler

# * Part 3 | Copy files and create links

ln -s mismagius1 Copy_25 # ! 1

ln -s ../teddiursa6 mismagius1/mothimteddiursa # ! 2

cat seel8/graveler > gabite5_76 # ! 3
chmod u+r mismagius1/snivy
cat mismagius1/snivy >> gabite5_76
chmod u-r mismagius1/snivy

ln gabite5 seel8/gurdurrgabite # ! 4

cat gabite5 > mismagius1/mothimgabite # ! 5

cp silcoon4 seel8/rufflet/silcoon4 # ! 6

chmod u+r seel8 && chmod u+r seel8/dusclops && chmod u+r seel8/rufflet # ! 7
cp -r seel8 litwick0/leafeon
chmod u-r seel8 && chmod u-r seel8/dusclops && chmod u-r seel8/rufflet

# * Part 4 | Some shit

# * Part 4.1
echo -e "\033[0;36mPart 4.1:\033[0m"
wc -m litwick0/snivy mismagius1/mothim mismagius1/snivy seel8/gurdurr 2>&1 | sort -nk1

# * Part 4.2
echo -e "\033[0;36mPart 4.2:\033[0m"
(ls -lt **/s* | head -n 2) 2>&1

# * Part 4.3
echo -e "\033[0;36mPart 4.3:\033[0m"
cat -n litwick0/* 2>/dev/null | grep -v "r$"

# * Part 4.4
echo -e "\033[0;36mPart 4.4:\033[0m"
ls -l **/*n 2>&1 | sort -nk2 | head -n 4

# * Part 4.5
echo -e "\033[0;36mPart 4.5:\033[0m"
cat **/*r 2>/dev/null | sort

# * Part 4.6
echo -e "\033[0;36mPart 4.5:\033[0m"
ls -1r seel8/ 2>/dev/null

# * Part 5 | Delete files

echo -e "\033[0;36mPart 5:\033[0m"
rm silcoon4
rm -rf litwick0/snivy
rm Copy_*
rm seel8/gurdurrgabi*
rm -r seel8
rm -r seel8/rufflet

# !!! 3 4 5 комментарии !!!